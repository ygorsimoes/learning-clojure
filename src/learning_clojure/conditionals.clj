(ns learning-clojure.conditionals)

(defn simple-if-conditional
  "Returns true if age is greater than 18 if not returns false."
  [age]
  (if (> age 18)
    true
    false))

(println (simple-if-conditional 20))
(println (simple-if-conditional 2))


(defn simple-when-conditional
  "Returns a greeting if the parameter is 'hello', else returns nil by default."
  [hello]
  (when (= hello "hello")
    "Hello my friend!"))

(println (simple-when-conditional "hello"))
(println (simple-when-conditional "hi"))