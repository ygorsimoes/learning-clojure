(ns learning.exercises.br.ufpe.cin.exercises-2)

(defn menor-de-tres
  "2. menorDeTres: recebe três valores e retorna o menor"
  [x y z]
  (if (< x y)
    (if (< x z)
      x
      z)
    (if (< y z)
      y
      z)))

(menor-de-tres 0 3 0.5)