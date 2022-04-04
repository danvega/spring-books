<script setup>
import { watchEffect } from 'vue'
import { useQuery, useResult } from '@vue/apollo-composable'
import gql from 'graphql-tag'

const ALL_BOOKS_QUERY = gql`
  query {
        allBooks {
          id
          title
          pages
          rating {
            star
          }
          author {
            firstName
            lastName
          }
        }
      }
`;

const { result, loading, error } = useQuery(ALL_BOOKS_QUERY)
const books = useResult(result, [], result.allBooks);

watchEffect(() => {
  console.log(books.value);
})
</script>

<template>
  <h1>Spring Books</h1>
  <p v-if="error">{{ error }}</p>
  <p v-if="loading">Loading...</p>
  <ul v-else>
    <li v-for="book in books" :key="book.id">{{ book.title }}</li>
  </ul>
</template>

<style>

</style>
