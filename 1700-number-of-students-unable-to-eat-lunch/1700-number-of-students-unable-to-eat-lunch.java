class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> qu = new LinkedList<>();
        for (int student : students) {
            qu.offer(student);
        }

        int index = 0;
        int attempts = 0;

        while (!qu.isEmpty() && attempts < qu.size()) {
            int stu = qu.poll();

            if (stu == sandwiches[index]) {
                index++;
                attempts = 0;
            } else {
                qu.offer(stu);
                attempts++;
            }
        }

        return qu.size();
    }
}
