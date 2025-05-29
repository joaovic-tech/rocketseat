// src/screens/Home/index.tsx
import { View, FlatList, KeyboardAvoidingView, Platform } from 'react-native'
import { styles } from './styles'
import Header from '../../components/Header'
import Input from '../../components/Input'
import Button from '../../components/Button'
import TaskList from '../../components/TaskList'
import { useState } from 'react'

export default function Home () {
  const [tasks, setTasks] = useState<
    { id: string; text: string; done: boolean }[]
  >([])
  const [taskText, setTaskText] = useState('')
  const generateId = () => `${Date.now()}-${Math.floor(Math.random() * 10000)}`

  function handleAddTask () {
    if (taskText.trim().length === 0) return

    setTasks(prev => [
      ...prev,
      { id: generateId(), text: taskText, done: false }
    ])
    setTaskText('')
  }

  function handleToggleDone (id: string) {
    setTasks(prev =>
      prev.map(task => (task.id === id ? { ...task, done: !task.done } : task))
    )
  }

  function handleDelete (id: string) {
    setTasks(prev => prev.filter(task => task.id !== id))
  }

  return (
    <View style={styles.container}>
      <Header />

      <KeyboardAvoidingView
        behavior={Platform.OS === 'ios' ? 'padding' : undefined}
        style={styles.content}
      >
        <View style={styles.inputRow}>
          <Input
            placeholder='Adicione uma nova tarefa'
            value={taskText}
            onChangeText={setTaskText}
          />
          <Button onPress={handleAddTask} />
        </View>

        <TaskList
          tasks={tasks}
          onToggleDone={handleToggleDone}
          onDelete={handleDelete}
        />
      </KeyboardAvoidingView>
    </View>
  )
}
