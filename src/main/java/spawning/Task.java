package spawning;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Task implements Runnable {

    int matrix1[][];
    int matrix2[][];
    int resultingMatrix[][];

    public Task(int m1[][], int m2[][]) {
        this.matrix1 = m1;
        this.matrix2 = m2;
        this.resultingMatrix = new int[m1.length][m1[0].length];
    }

    public void run() {
        timeConsumingTask();
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                resultingMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }

    private void timeConsumingTask(){
        try {
            URL url = new URL("https://httpbin.org/bytes/1024");
            InputStream in = new BufferedInputStream(url.openStream());
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            int n = 0;
            while (-1 != (n = in.read(buf))) {
                out.write(buf, 0, n);
            }
            out.close();
            in.close();
            byte[] response = out.toByteArray();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
