package com.byy.byybackendserviceclient.judge.strategy;

import com.byy.byybackendmodel.model.codesandbox.JudgeInfo;
import com.byy.byybackendmodel.model.dto.question.JudgeCase;
import com.byy.byybackendmodel.model.entity.Question;
import com.byy.byybackendmodel.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;

}
