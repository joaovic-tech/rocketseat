import { View } from 'react-native'
import { styles } from './styles'
import Logo from '../../assets/logo.svg'

export default function Header () {
  return (
    <View style={styles.container}>
      <Logo width={110} height={32} />
    </View>
  )
}
