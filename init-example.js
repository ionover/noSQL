// init-users.js

// Получаем или создаём базу example
const exampleDb = db.getSiblingDB('example');

// Создаём коллекцию users (если ещё не создана)
if (!exampleDb.getCollectionNames().includes('user')) {
  exampleDb.createCollection('user');
}
