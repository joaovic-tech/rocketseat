# 📝 ToDo App – Rocketseat Challenge

Este projeto foi desenvolvido como parte do desafio do curso **Fundamentos do React Native** da [Rocketseat](https://www.rocketseat.com.br/), com o objetivo de praticar conceitos essenciais de componentização, gerenciamento de estado e estilização no React Native usando o Expo.

![Template](/template/template.webp)

---

## 🧩 Layout no Figma

📐 Você pode visualizar e duplicar o layout original utilizado neste projeto diretamente no Figma:  
🔗 [Abrir no Figma](https://www.figma.com/file/1XfZQGSWk4HWjvwcjd2nOP/ToDo-List/duplicate)

---

## 🚀 Tecnologias Utilizadas

- **React Native**
- **Expo**
- **TypeScript**
- **Google Fonts (Inter) via @expo-google-fonts**
- **React Native SVG**
- **StyleSheet + Theme global customizado**

---

## 🔧 Funcionalidades Implementadas

- ✅ Adicionar nova tarefa
- ✅ Marcar/desmarcar tarefa como concluída
- ✅ Remover tarefa
- ✅ Contadores dinâmicos de tarefas criadas e concluídas
- ✅ Feedback visual quando não há tarefas
- ✅ Responsivo e com UX limpa e funcional

---

## 🎨 Design System

O projeto utiliza um sistema de temas com:

- Paleta de cores customizada (`gray`, `blue`, `purple`)
- Fonte `Inter` nas variações regular e bold
- Espaçamento padronizado (small, medium, large)

Exemplo:

```ts
fonts: {
  regular: 'Inter-Regular',
  bold: 'Inter-Bold'
},
spacing: {
  small: 12,
  medium: 14,
  large: 16
}
```

---

## 📁 Estrutura de Pastas

```txt
src/
├── assets/               # SVGs (logo, ícones)
├── components/
│   ├── Button/
│   ├── Header/
│   ├── Input/
│   ├── TaskItem/
│   └── TaskList/
├── screens/
│   └── Home/             # Tela principal do app
├── theme/                # Tema global
└── App.tsx               # Fonte + navegação inicial
```

---

## 📦 Como executar o projeto

```bash
# 1. Clone o repositório
git clone https://github.com/joaovic-tech/ignite-todo

# 2. Acesse a pasta
cd todo-rn-rocketseat

# 3. Instale as dependências
npm install

# 4. Rode com o Expo
npx expo start
```

---

## 📸 Capturas de Tela

| Tela Inicial            | Descrevendo a tarefa          | Tarefa Adicionada        |
|-------------------------|----------------------------|------------------------|
| ![Tela Inicial](/template/Todo-Empty.png) | ![Descrevendo a tarefa](/template/Todo-Description.png) | ![Tarefa Adicionada](/template/Todo-List.png) |

---

## 🧠 O que aprendi

- Componentização no React Native
- Uso de SVG como componentes
- Integração de fontes personalizadas com Expo
- Gerenciamento de estado com `useState`
- Aplicação de estilos com tema global
- Boas práticas de estruturação e reusabilidade de componentes

---

## 💼 Autor

Feito por **[João victor]**  
🔗 [LinkedIn](https://www.linkedin.com/in/joaovic-tech/)  
🌐 [Portfólio](https://joaovic-tech.com/)

---

## 📄 Licença

Este projeto está licenciado sob a licença MIT.  
Sinta-se à vontade para usar como base para seus próprios projetos.
