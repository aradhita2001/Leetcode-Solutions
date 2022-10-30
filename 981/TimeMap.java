import java.util.ArrayList;
import java.util.HashMap;

class TimeMap {

    HashMap<String, TimeSeries> map;
    public TimeMap() {
        map = new HashMap<String, TimeSeries>();
    }
    
    public void set(String key, String value, int timestamp) {
        TimeSeries currentSeries = map.getOrDefault(key, new TimeSeries());
        currentSeries.add(timestamp, value);
        map.put(key, currentSeries);
    }
    
    public String get(String key, int timestamp) {
        TimeSeries currentSeries = map.getOrDefault(key, new TimeSeries());
        return currentSeries.get(timestamp);
    }

    class TimeSeries{
        ArrayList<Data> series;

        public TimeSeries(){
            series = new ArrayList<Data>();
        }

        public void add(int timestamp, String value){
            series.add(new Data(timestamp, value));
        }

        public String get(int timestamp){

            int index = series.size() - 1;
            while(index != -1){
                if(series.get(index).getTime() <= timestamp) return series.get(index).getValue();
                index--;
            }

            return "";
        }
    }

    class Data{
        private int timestamp;
        private String value;

        public Data(int timestamp, String value){
            this.timestamp = timestamp;
            this.value = value;
        }

        public int getTime(){
            return timestamp;
        }

        public String getValue(){
            return value;
        }
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */