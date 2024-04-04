import com.gurobi.gurobi.GRBException; // 使用正确的包路径来导入 GRBException

public class CheckGurobiException {
    public static void main(String[] args) {
        try {
            // 由于我们已经导入了GRBException，这里我们可以直接引用它
            throw new GRBException("Test if GRBException class is available.");
        } catch (GRBException e) {
            // 这个 catch 块确认了 GRBException 类可以在编译时被识别和使用
            System.out.println("gurobi.GRBException is available and working.");
        }
    }
}
