//создает модель емейла


package service;

import Model.NotificationMessage;

public interface NotificationTemplateService {

    NotificationMessage createNotificationMessage (String templateName, Object model);
}
