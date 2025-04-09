class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int Gas_station = 0, station_Cost = 0, result = 0, total = 0;

        for (int i = 0; i < gas.length; i++) {
            Gas_station += gas[i];
            station_Cost += cost[i];
        }
        if (Gas_station < station_Cost) return -1;

        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];

            if (total < 0) {
                total = 0;
                result = i + 1;
            }
        }
        return result;
    }
}
