// src/components/TaskItem/index.tsx
import { Text, TouchableOpacity, View } from 'react-native'
import { styles } from './styles'
import Trash from '../../assets/trash.svg'
import Check from '../../assets/check.svg'
import Unchecked from '../../assets/unchecked.svg'
import theme from '../../theme'

interface Props {
  task: {
    id: string
    text: string
    done: boolean
  }
  onToggleDone: (id: string) => void
  onDelete: (id: string) => void
}

export default function TaskItem ({ task, onToggleDone, onDelete }: Props) {
  return (
    <View style={styles.container}>
      <TouchableOpacity onPress={() => onToggleDone(task.id)}>
        {task.done ? <Check /> : <Unchecked />}
      </TouchableOpacity>
      <Text style={[styles.text, task.done && styles.textDone]}>
        {task.text}
      </Text>
      <TouchableOpacity onPress={() => onDelete(task.id)}>
        <Trash width={32} height={32} />
      </TouchableOpacity>
    </View>
  )
}
