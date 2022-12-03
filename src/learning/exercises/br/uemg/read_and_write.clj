(ns learning.exercises.br.uemg.read-and-write
  (:require [clojure.java.io :as io]))

(defn get-path-file-cashier
  "Return the path of file."
  [cashier]
  (let [project-path (System/getProperty "user.dir")
        exercise-path "/src/learning/exercises/br/uemg/cashier"
        file-final-path (io/file project-path exercise-path (str cashier ".txt"))]
    file-final-path))

(defn file-exist?
  "Return true if file exist else return false."
  [file]
  (.exists file))

(defn all-cashier-exist?
  "Return true if all cashier exist else return false."
  [path-file-cashier]
  (for [x (range 1 7)]
    (file-exist? (path-file-cashier x))))

(defn read-cashier-as-string
  "Return content as string in cashier."
  [cashier]
  (with-open [reader (io/reader (get-path-file-cashier cashier))]
    (reduce conj [] (line-seq reader))))

(defn read-cashier
  "Return content in cashier."
  [cashier]
  (map read-string (read-cashier-as-string cashier)))

(defn read-all-cashier
  "Return all contents in cashier (1 to 6)."
  []
  (for [x (range 1 7)]
    (read-cashier x)))

(defn two-decimal-places
  "Return the number with two decimal cases."
  [number]
  (format "%.2f" number))

;; Exercises:
;; Usando as funções para leitura e escrita em arquivo ".txt", faça um programa LISP que faça o que o enunciado pede:
;; Um empresário te contratou para desenvolver um sistema em CLISP, que recebe dados através de um arquivo texto
;; contendo o quantitativo diário vendido em cada um dos seus 6 caixas, durante um mês. De posse destes dados, faça:

;; a) A quantidade mensal vendida por dia.
;; b) A quantidade mensal vendida por cada caixa.
;; c) A média mensal de produtos vendidos em todos os caixas.
;; d) Determine qual caixa teve a maior e a menor quantidade de vendas no mês.

(defn letter-a
  "a) A quantidade mensal vendida por dia."
  []
  (read-all-cashier))

(defn letter-b
  "b) A quantidade mensal vendida por cada caixa."
  []
  (for [x (range 1 7)]
    (reduce + (read-cashier x))))

(defn letter-c
  "c) A média mensal de produtos vendidos em todos os caixas."
  []
  (two-decimal-places (/ (reduce + (letter-b)) 6)))

(defn letter-d
  "d) Determine qual caixa teve a maior e a menor quantidade de vendas no mês."
  []
  {:min (two-decimal-places (apply min (letter-b)))
   :max (two-decimal-places (apply max (letter-b)))})


;; Results:

(println "Letra (A):" (letter-a))
(println "Letra (B):" (letter-b))
(println "Letra (C):" (letter-c))
(println "Letra (D):" (letter-d))