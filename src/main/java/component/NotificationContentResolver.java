package component;

public interface NotificationContentResolver {

    String resolve(String template, Object model);
}