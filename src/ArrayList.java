import java.util.ListIterator;

public class ArrayList {
        private int size = 0;
        private Object[] elementData = new Object[100];

        public boolean addLast(Object element){

                elementData[size] = element;
                size++;
                return true;
        }

        public boolean addFirst(Object element){
                return (add(0,element));

        }



        public boolean add(int index,Object element){
                for(int i=size-1;i>=index;i--){
                        elementData[i+1] = elementData[i];
                }
                elementData[index] = element;
                size++;
                return true;
        }



        public Object[] getElementData() {
                return elementData;
        }

        @Override
        public String toString() {
                String str = "[";
                for(int i = 0; i < size; i++){
                        str += elementData[i];
                        if(i<size-1){
                        str += ",";}
                }
                return str + "]";
        }

        public Object remove(int index){
                Object removed = elementData[index];
                for(int i=index+1;i<=size-1;i++){
                        elementData[i-1] = elementData[i];
                }
                size--;
                elementData[size] =null;

                return removed;
        }

        public Object removeFirst(){
                return remove(0);
        }

        public Object removeLast(){
                return remove(size-1);
        }

        public Object get(int index){
                return elementData[index];
        }


        public int indexOf(Object o) {
                for (int i = 0; i< size; i++){
                        if(o.equals(elementData[i])){
                                return i;
                        }
                }
                return -1;

        }

        public int size() {
                return size;
        }

        public ListIterator listIterator(){
                return new ListIterator();
        }

        class ListIterator{
                private int nextIndex = 0;
                public Object next(){
//                        Object returnData =  elementData[nextIndex];
//                        nextIndex++;
//                        return returnData;
                        return elementData[nextIndex++];
                }

                public boolean hasNext(){
                        return nextIndex < size;
                }
                public Object previous(){
                        return elementData[--nextIndex];
                }

                public boolean hasPrevious(){
                        return nextIndex > 0;
                }

                public void add(Object element){
                        ArrayList.this.add(nextIndex++,element);
                }
                public void remove(){
                        ArrayList.this.remove(nextIndex-1); // 현재 요소를 제거
                        nextIndex--; // 인덱스는 이전 요소를 가리키게 됨
                }

        }


}
