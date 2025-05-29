// src/components/Button/index.tsx
import { TouchableOpacity } from 'react-native'
import Plus from '../../assets/plus.svg'
import { styles } from './styles'

export default function Button ({ onPress }: { onPress: () => void }) {
  return (
    <TouchableOpacity style={styles.button} onPress={onPress}>
      <Plus width={16} height={16} />
    </TouchableOpacity>
  )
}
