(ns learning.segundatech.initial.functions)

;; (defn name-function
;;  "document comment of your function"
;;  [arg1 arg2]
;;  (return))
(defn basic-function
  "this is a basic function"
  []
  (< 1 2))

(defn happy-birthday
  "wishes a happy birthday"
  [name]
  (println "Happy Birthday," name "!!!"))

(defn hello-world
  "return (println) with argument name case not empty."
  [name]
  (if (empty? name)
    (println "Hello, World!")
    (println "Hello," name "!")))


;; Test functions
(println "basic-function:" (basic-function))
(hello-world "Clojure")