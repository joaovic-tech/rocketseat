// src/screens/Home/styles.ts
import { StyleSheet } from 'react-native';
import theme from '../../theme';

export const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: theme.colors.gray600,
    },
    content: {
        flex: 1,
        paddingHorizontal: 24,
    },
    inputRow: {
        flexDirection: 'row',
        gap: 8,
        marginTop: -27, // para sobrepor o Header
        marginBottom: 24,
    },
});
