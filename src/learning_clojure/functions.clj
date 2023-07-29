(ns learning-clojure.functions)

(defn simple-function
  "Simple function that returns a string."
  []
  "Hello, my simple function!")


(defn your-name-is
  "Function that returns a string with the name of the user."
  [name]
  (str "Your name is " name "!"))

(defn sum
  "Function that returns the sum of two numbers."
  [number-one, number-two]
  (+ number-one number-two))

(println (simple-function))

(println (sum 2 2))
(println (your-name-is "Ygor Simões"))