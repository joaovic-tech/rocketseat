import React, { useState } from 'react'

import {
  Text,
  TextInput,
  View,
  TouchableOpacity,
  FlatList,
  Alert
} from 'react-native'
import { styles } from './styles'
import { Participant } from '../../components/Participant'

export default function Home () {
  const [participants, setParticipants] = useState<string[]>([])
  const [participantName, setParticipantName] = useState('')

  function handleParticipantAdd () {
    if (!participantName) {
      return Alert.alert(
        'Nome do participante',
        'Informe o nome do participante.'
      )
    }
    if (participants.includes(participantName)) {
      return Alert.alert(
        'Participante Existe',
        'já existe um participante na lista de participantes.'
      )
    }

    setParticipants(prevState => [...prevState, participantName])
    setParticipantName('')
  }

  function handleParticipantRemove (name: string) {
    Alert.alert(
      'Remover participante',
      `Deseja remover o participante ${name}?`,
      [
        {
          text: 'Sim',
          onPress: () => {
            setParticipants(prevState =>
              prevState.filter(participant => participant !== name)
            )
          }
        },
        {
          text: 'Não',
          style: 'cancel'
        }
      ]
    )
  }

  return (
    <View style={styles.container}>
      <Text key='1' style={styles.eventName}>
        Nome do evento
      </Text>
      <Text key='2' style={styles.eventDate}>
        Terça, 25 de Fevereiro de 2025.
      </Text>
      <View style={styles.form}>
        <TextInput
          style={styles.input}
          placeholder='Nome do participante'
          placeholderTextColor={'#6b6b6b'}
          onChangeText={setParticipantName}
          value={participantName}
        />

        <TouchableOpacity style={styles.button} onPress={handleParticipantAdd}>
          <Text style={styles.buttonText}>+</Text>
        </TouchableOpacity>
      </View>

      <FlatList
        data={participants}
        keyExtractor={item => item}
        renderItem={({ item }) => (
          <Participant
            key={item}
            name={item}
            onRemove={() => handleParticipantRemove(item)}
          />
        )}
        showsVerticalScrollIndicator={false}
        ListEmptyComponent={() => (
          <Text style={styles.listEmptyText}>
            Ninguém chegou no evento ainda? Adicione participantes a sua lista
            de presença.
          </Text>
        )}
      />
    </View>
  )
}
