package InterviewExercise;

import java.util.*;

/**
 * @author lbf
 * @date 2020/8/21 7:53
 */

class IOTest01 {
        private ArrayList<Student> arrayList = new ArrayList<Student>();
        public void save(){
            Random random = new Random();
            //保存40位同学的姓名、学号、成绩
            for (int i = 0,j = 10; i <= 40; i++) {
                int id = 180201 + i;
                String name = "同学" + j++;
                int score = random.nextInt(51) + 50;
                this.arrayList.add(new Student(id,name,score));
            }
        }
        public void sort(){

            //进行排序,成绩按照从高往低排序，成绩相同时学号小的排在前优先打印
            Comparator<Student> comparator = new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o2.getScore()> o1.getScore() ? 1 : o2.getScore() < o1.getScore() ?
                            -1 : o1.getId() - o2.getId();
                }
            };
            Collections.sort(arrayList,comparator);
        }
        public void print(){
            Iterator<Student> iterator = this.arrayList.iterator();
            while (iterator.hasNext()){
                Student value = iterator.next();
                System.out.println("学号："+ value.getId() +"姓名："+value.getName() +
                        "成绩："+ value.getScore());
            }
        }
        public static void main(String[] args) {
            IOTest01 ioTest01 = new IOTest01();

            ioTest01.save();
            ioTest01.sort();
            ioTest01.print();
        }
    }


