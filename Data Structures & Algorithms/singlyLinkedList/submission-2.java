class LinkedList {
        private ListNode head = null;
        int size = 0;

    public LinkedList() {

    }

    public int get(int index) {
        if (index < 0 || index >= size)
            return -1;
        
        ListNode dummy = head;
        int count = 0;

        while (count < index)   {
            dummy = dummy.next;
            count++;
        }

        return dummy.val;
        
    }

    public void insertHead(int val) {
        head = new ListNode(val, head);
        size++;
    }

    public void insertTail(int val) {

        if (head == null) {
            head = new ListNode(val, null);
            size++;
            return;
        }
        ListNode dummy = head;

        while (dummy.next != null)   {
            dummy= dummy.next;
        }

        dummy.next = new ListNode(val, null);

        size++;
    }

    public boolean remove(int index) {
        
        if (index < 0 || index >= size)   {
            return false;
        }

        else if (index == 0) {
            head = head.next;
            size--;
            return true;
        }

        int count = 0;
        ListNode dummy = head;

        while (count < index - 1)    {
            count++;
            dummy = dummy.next;
        }

        dummy.next = dummy.next.next;
        
        size--;
        return true;
        
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> result = new ArrayList<>();

        ListNode dummy = head;

        while (dummy != null)   {
            result.add(dummy.val);
            dummy = dummy.next;
        }

        return result;
    }
}

class ListNode  {
    int val;
    ListNode next;

    ListNode (int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
