package life.homail.notesapp.Maths.MathMcqsPage;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.github.barteksc.pdfviewer.PDFView;
import life.homail.notesapp.R;

public class MathMcqsPageMain extends AppCompatActivity{

    private String chNo;
    private PDFView pdfView;
    @Override
    public void onCreate(Bundle getCodeFromParent){
        super.onCreate(getCodeFromParent);
        super.setContentView(R.layout.math_mcq_activity);
        this.initializeViews();
        this.getChName();
        this.setPdfBasedOnChapter();
    }





    private void setPdfBasedOnChapter(){
        switch (this.chNo){
            case "1"-> this.setPdf("MathPdfs/Mcqs/part2Mcqs (1).pdf");
            case "2"-> this.setPdf("MathPdfs/Mcqs/part2Mcqs (2).pdf");
            case "3"-> this.setPdf("MathPdfs/Mcqs/part2Mcqs (3).pdf");
            case "4"-> this.setPdf("MathPdfs/Mcqs/part2Mcqs (4).pdf");
            case "5"-> this.setPdf("MathPdfs/Mcqs/part2Mcqs (5).pdf");
            case "6"-> this.setPdf("MathPdfs/Mcqs/part2Mcqs (6).pdf");
            case "7"-> this.setPdf("MathPdfs/Mcqs/part2Mcqs (7).pdf");
            default -> throw new RuntimeException();
        }
    }


    private void setPdf(String assetPath){
        this.pdfView.fromAsset(assetPath).load();
    }

    private void getChName(){
        Intent intent=getIntent();
        this.chNo=intent.getStringExtra("chapterNo");
    }
    private void initializeViews(){
        this.pdfView=super.findViewById(R.id.pdfView);
    }
}