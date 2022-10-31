(ns learning.basic.collections.hashmap.deepening)

;; Created hashmap.
(def inventory {:backpack {:price 100, :quantity 10},
                :boot     {:price 500, :quantity 4},
                :shirt    {:price 10, :quantity 15}})

;; Getters.
(println (get inventory :boot {}))
(println (get inventory :socks {}))

(println (:price (:backpack inventory)))
(println (:quantity (:backpack inventory)))

;; Associates and disassociate values in hashmap.
(println (assoc inventory :keychain {:price 2 :quantity 100}))
(println (dissoc inventory :boot))

;; Update-in.
(println (update-in inventory [:backpack :price] inc))
(println (update-in inventory [:backpack :quantity] #(+ % 1)))

;; Threading first.
(println (-> inventory
             :backpack
             :price))

