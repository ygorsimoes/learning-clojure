(ns learning-clojure.variables)

;; Global variables are defined with (def $ $)
(def global-variable "This is a global variable!")
(println global-variable)

;; Local variables are defined with (let [$ $] ...)
(let [local-variable-string "This is a string local variable!"
      local-variable-integer 20]
  (println local-variable-string)
  (println "This is a integer local variable:" local-variable-integer))