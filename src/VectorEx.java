public class VectorEx {
    Vector<Integer> v = new Vector<Integer>(7);
    v.add(5);
    v.add(4);
    v.add(-1);

    int n = v.size();
    int c = v.capacity();

    v.add(2,100);

    Integer obj = v.get(1);
    int i = obj.intValue();

    v.remove(1);

    int last = v.lastElement();

    v.removeAllElements();

}