package Day23_NestedLoop_CreatingArray_ArrayObject;

public class CellAndColum3 {

	public static void main(String[] args) {
	     for (int i = 1; i <= 3; i++) {
//           System.out.println("Row : " + i);
           for (int x = 1; x <= 4; x++) {
               System.out.print("|" + "____" + "|");
//             System.out.print("cell(" + i + "," + x +") ");
           }
           System.out.println();
       }

	}

}
