package com.epam.refactoring.solution2;

import com.epam.refactoring.util.MessageSenderUtil;

public class MessageSender {
  private void sendMessage() {
    int templateCode = MessageSenderUtil.getTemplateTypeCodeFromDB();

    TemplateHandler templateHandler = new TemplateHandler();
    String templateAsString = templateHandler.getTemplate(templateCode).generateTemplate();

    MessageSenderUtil.sendMessage(templateAsString);
  }
}
