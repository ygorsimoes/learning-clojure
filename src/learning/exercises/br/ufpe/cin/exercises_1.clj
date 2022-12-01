(ns learning.exercises.br.ufpe.cin.exercises_1)

(defn menor-de-dois
  "1. menorDeDois: recebe dois valores e retorna o menor"
  [x, y]
  (if (< x y)
    x
    y))

(menor-de-dois 100 2)