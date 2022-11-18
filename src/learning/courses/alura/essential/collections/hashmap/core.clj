(ns learning.courses.alura.essential.collections.hashmap.core)

;; Created hashmap.
(def inventory {:backpack 5,
                :boot     10,
                :shirt    20})

(println "Number of elements:" (count inventory))
(println "Keys:" (keys inventory))
(println "Values:" (vals inventory) "\n")

;; Associates values in hashmap.
(println "Associates:" (assoc inventory :pants 2))
(println "Associates:" (assoc inventory :boot 4) "\n")

;; Disassociate values.
(println "Disassociate:" (dissoc inventory :shirt) "\n")

;; Update values.
(println "Update:" (update inventory :backpack inc))
(println "Update with lambda:" (update inventory :boot #(* % 2)))