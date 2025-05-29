// src/components/Input/index.tsx
import { TextInput, TextInputProps } from 'react-native'
import { useState } from 'react'
import { styles } from './styles'

export default function Input (props: TextInputProps) {
  const [isFocused, setIsFocused] = useState(false)

  return (
    <TextInput
      style={[styles.input, isFocused && styles.inputFocused]}
      placeholderTextColor='#808080'
      onFocus={() => setIsFocused(true)}
      onBlur={() => setIsFocused(false)}
      {...props}
    />
  )
}
