import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [vue()],
  server: {
    proxy: {
      '/graphql': {
        target: 'http://localhost:8080/graphql',
        changeOrigin: true,
        secure: false,
      }
    }
  }
})
