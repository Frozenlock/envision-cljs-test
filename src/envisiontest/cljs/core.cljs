(ns envisiontest.core
  (:require [envision-cljs.core :as v]))


(set! (.-onload js/window)
      ;; First we need to generate some data
      (fn []
        (let [x-axis (range 500)
            y1-axis (map #(js/Math.sin (/ % 10)) x-axis)
            y2-axis (map #(js/Math.cos (/ % 50)) x-axis)
            serie-1 [x-axis, y1-axis]
            serie-2 {:points {:show true} ;; these config will be applied to each view (detail AND summary)
                     :shadowSize 4
                     :data [x-axis, y2-axis]}
            raw-data [serie-1, serie-2]]
        
        ;; now let's make a graph!
          (v/timeseries {:container (js/document.getElementById "graph")
                         ;; provided you have a div element "graph" in the DOM
                       :detail {:data raw-data}
                       :summary {:data raw-data}}))))