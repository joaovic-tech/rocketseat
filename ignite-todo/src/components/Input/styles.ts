// src/components/Input/styles.ts
import { StyleSheet } from 'react-native';
import theme from '../../theme';

export const styles = StyleSheet.create({
    input: {
        flex: 1,
        height: 54,
        backgroundColor: theme.colors.gray500,
        borderRadius: 6,
        paddingHorizontal: 16,
        color: theme.colors.gray100,
        fontFamily: theme.fonts.regular,
        fontSize: theme.spacing.large,
        borderWidth: 1,
        borderColor: 'transparent',
    },
    inputFocused: {
        borderColor: theme.colors.purple,
    },
});
