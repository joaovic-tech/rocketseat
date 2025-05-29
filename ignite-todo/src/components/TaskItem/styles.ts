// src/components/TaskItem/styles.ts
import { StyleSheet } from 'react-native';
import theme from '../../theme';

export const styles = StyleSheet.create({
    container: {
        height: 64,
        backgroundColor: theme.colors.gray500,
        borderRadius: 6,
        borderColor: theme.colors.gray400,
        borderWidth: 1,
        flexDirection: 'row',
        alignItems: 'center',
        paddingHorizontal: 12,
        gap: 8,
        marginBottom: 8,
    },
    text: {
        color: theme.colors.gray100,
        flex: 1,
    },
    textDone: {
        textDecorationLine: 'line-through',
        color: theme.colors.gray300,
    },
});
