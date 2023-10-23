package pastquestions;

import java.util.*;

/*
전체 스테이지 개수 n

 */
class Question_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] stages={4,4,4,4,4};
        int len=stages.length;
        Arrays.sort(stages);
        int[] data=new int[501];
        List<Stages> results = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            data[stages[i]]++;
        }
        for (int datum : data) {
            System.out.println(datum);
        }
        int chel=len;
        for (int i = 1; i < n+1; i++) {
            results.add(new Stages(i, (double) data[i] / chel));
            chel-=data[i];
        }
        for (Stages result : results) {
            System.out.println(result.num+" :  "+result.failure);
        }
        Collections.sort(results);
        for (Stages result : results) {
            System.out.print(result.num+" ");
        }

    }

    public static class Stages implements Comparable<Stages>{
        int num;
        Double failure;

        public Stages(int num, Double failure) {
            this.num = num;
            this.failure = failure;
        }

        @Override
        public int compareTo(Stages o) {
            if(this.failure.equals(o.failure)){
                return this.num-o.num;
            }
            return o.failure.compareTo(this.failure);
        }
    }

}