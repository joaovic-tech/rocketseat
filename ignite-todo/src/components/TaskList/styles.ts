// src/components/TaskList/styles.ts
import { StyleSheet } from 'react-native';
import theme from '../../theme';

export const styles = StyleSheet.create({
    container: {
        paddingHorizontal: 24,
        flex: 1,
        flexDirection: 'column',
        gap: 20,
    },
    header: {
        flexDirection: 'row',
        justifyContent: 'space-between',
        gap: 12,
    },
    counterContainer: {
        justifyContent: 'center',
        alignItems: 'center',
        flexDirection: 'row',
        gap: 8,
    },
    created: {
        fontFamily: theme.fonts.bold,
        fontSize: theme.spacing.medium,
        color: theme.colors.blue,
    },
    completed: {
        color: theme.colors.purple,
        fontFamily: theme.fonts.bold,
        fontSize: theme.spacing.medium,
    },
    counter: {
        width: 25,
        height: "100%",
        backgroundColor: theme.colors.gray400,
        borderRadius: 99,
    },
    counterText: {
        color: theme.colors.gray200,
        textAlign: 'center',
    },
    empty: {
        borderColor: theme.colors.gray300,
        borderTopWidth: 1,
        alignItems: 'center',
        paddingTop: 48,
        flexDirection: 'column',
        gap: 16,
    },
    emptyText: {
        color: theme.colors.gray300,
        fontSize: theme.spacing.medium,
        textAlign: 'center',
    },
    emptyTitle: {
        fontFamily: theme.fonts.bold,
    },
    emptySubtitle: {
        fontFamily: theme.fonts.regular,
    },
});
