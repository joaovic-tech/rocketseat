// src/components/Button/styles.ts
import { StyleSheet } from 'react-native';
import theme from '../../theme';

export const styles = StyleSheet.create({
    button: {
        width: 52,
        height: 52,
        backgroundColor: theme.colors.blueDark,
        borderRadius: 6,
        alignItems: 'center',
        justifyContent: 'center',
    },
});
