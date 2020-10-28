package com.epam.refactoring.solution1;

import com.epam.refactoring.util.MessageSenderUtil;

public class MessageSender {

  private void sendEmail() {
    int emailTemplateCode = MessageSenderUtil.getTemplateTypeCodeFromDB();
    String template = MessageType.getTemplateByCode(emailTemplateCode).getPersonalMailTemplate().getTemplate();
    MessageSenderUtil.sendMessage(template);

  }
}
