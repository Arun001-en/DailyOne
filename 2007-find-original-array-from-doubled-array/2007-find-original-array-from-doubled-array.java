class Solution {
    public int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            return new int[0];
        }

        Arrays.sort(changed);

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : changed) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int[] result = new int[changed.length / 2];
        int index = 0;
        for (int i : changed) {
            int count = map.getOrDefault(i, 0);
            if (count == 0) continue;
            map.put(i, count - 1);
            int twice = 2 * i;
            if (i == 0) {
                if (map.getOrDefault(0, 0) == 0) {
                    return new int[0];
                }
                map.put(0, map.get(0) - 1);
            } else {
                if (map.getOrDefault(twice, 0) == 0) {
                    return new int[0];
                }
                map.put(twice, map.get(twice) - 1);
            }
            result[index++] = i;
        }
        return result;
    }
}