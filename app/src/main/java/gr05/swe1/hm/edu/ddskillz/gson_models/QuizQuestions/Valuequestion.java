
package gr05.swe1.hm.edu.ddskillz.gson_models.QuizQuestions;

import android.app.Fragment;
import android.util.Log;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

import gr05.swe1.hm.edu.ddskillz.activities.quiz.RadioFragment;
import gr05.swe1.hm.edu.ddskillz.activities.quiz.SliderFragment;

public class Valuequestion extends Question{

    @Expose
    private String text;
    @Expose
    private Integer lowerBound;
    @Expose
    private Integer upperBound;
    @Expose
    private Integer correctValue;

    private transient Fragment fragment;

    @Override
    public Fragment getFragment() throws RuntimeException{
        if(fragment==null) {
            fragment = SliderFragment.newInstance(lowerBound,upperBound);
        }

        return fragment;
    }

    @Override
    public String getAnswer() {
        return correctValue+"";
    }

    /**
     * 
     * @return
     *     The text
     */
    @Override
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return
     *     The lowerBound
     */
    public Integer getLowerBound() {
        return lowerBound;
    }

    /**
     * 
     * @param lowerBound
     *     The lowerBound
     */
    public void setLowerBound(Integer lowerBound) {
        this.lowerBound = lowerBound;
    }

    /**
     * 
     * @return
     *     The upperBound
     */
    public Integer getUpperBound() {
        return upperBound;
    }

    /**
     * 
     * @param upperBound
     *     The upperBound
     */
    public void setUpperBound(Integer upperBound) {
        this.upperBound = upperBound;
    }

    /**
     * 
     * @return
     *     The correctValue
     */
    public Integer getCorrectValue() {
        return correctValue;
    }

    /**
     * 
     * @param correctValue
     *     The correctValue
     */
    public void setCorrectValue(Integer correctValue) {
        this.correctValue = correctValue;
    }

}
