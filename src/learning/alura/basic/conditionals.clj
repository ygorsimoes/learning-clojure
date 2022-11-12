(ns learning.alura.basic.conditionals)

;; Basic conditional:
(let [number-one 2
      numbe-two 12]
  (println "Bigger or smaller:" (< number-one numbe-two)))

(let [number-one 5
      number-two 5
      is-bigger? (> number-one number-two)]
  (println "This is bigger?" is-bigger?))

;; Conditional with if and else:
(def number-one 2)
(def number-two 5)
(def number-three 7)

(defn sum [a b]
  (+ a b))

;; Predicates:
;; If version
(defn if-is-bigger?
  [a b c]
  (if (> c (sum a b))
    true
    false))

;; When version
(defn when-is-bigger?
  [a b c]
  (when (> c (sum a b))
    true))

;; Concise version
(defn concise-is-bigger?
  [a b c]
  (> c (sum a b)))

(println "\nVersion: if. Is bigger?" (if-is-bigger? number-one, number-two, number-three))
(println "Version: when. Is bigger?" (when-is-bigger? number-one, number-two, number-three))
(println "Version: concise. Is bigger?" (concise-is-bigger? number-one, number-two, number-three))