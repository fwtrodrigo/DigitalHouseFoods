package br.com.digitalhousefoods.domain

data class Restaurante(val id: Int, val nome: String, val endereco: String, val horario: String, val imagem: Int, val pratos: ArrayList<Prato>)