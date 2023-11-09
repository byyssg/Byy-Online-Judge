package com.byy.byybackendserviceclient.judge;

import com.byy.byybackendserviceclient.judge.strategy.DefaultJudgeStrategy;
import com.byy.byybackendserviceclient.judge.strategy.JavaLanguageJudgeStrategy;
import com.byy.byybackendserviceclient.judge.strategy.JudgeContext;
import com.byy.byybackendserviceclient.judge.strategy.JudgeStrategy;
import com.byy.byybackendmodel.model.codesandbox.JudgeInfo;
import com.byy.byybackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
