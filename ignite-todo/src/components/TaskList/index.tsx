// src/components/TaskList/index.tsx
import { View, Text, FlatList } from 'react-native'
import Clipboard from '../../assets/clipboard.svg'
import TaskItem from '../TaskItem'
import { styles } from './styles'

interface Task {
  id: string
  text: string
  done: boolean
}

interface Props {
  tasks: Task[]
  onToggleDone: (id: string) => void
  onDelete: (id: string) => void
}

export default function TaskList ({ tasks, onToggleDone, onDelete }: Props) {
  const created = tasks.length
  const completed = tasks.filter(t => t.done).length

  return (
    <View style={styles.container}>
      <View style={styles.header}>
        <View style={styles.counterContainer}>
          <Text style={styles.created}>Criadas</Text>
          <View style={styles.counter}>
            <Text style={styles.counterText}>{created}</Text>
          </View>
        </View>
        <View style={styles.counterContainer}>
          <Text style={styles.completed}>Completadas</Text>
          <View style={styles.counter}>
            <Text style={styles.counterText}>{completed}</Text>
          </View>
        </View>
      </View>

      {created === 0 ? (
        <View style={styles.empty}>
          <Clipboard />
          <Text style={styles.emptyText}>
            <Text style={styles.emptyTitle}>
              Você ainda não tem tarefas cadastradas
            </Text>
            {'\n'}
            <Text style={styles.emptySubtitle}>
              Crie tarefas e organize seus itens a fazer
            </Text>
          </Text>
        </View>
      ) : (
        <FlatList
          data={tasks}
          keyExtractor={item => item.id}
          renderItem={({ item }) => (
            <TaskItem
              task={item}
              onToggleDone={onToggleDone}
              onDelete={onDelete}
            />
          )}
        />
      )}
    </View>
  )
}
