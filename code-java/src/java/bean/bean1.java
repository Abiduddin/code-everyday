package java.bean;

import java.io.Serializable;

public class bean1 {

    class Book implements Serializable {
        private String authorsName;
        private String title;
        private boolean isPublish;

        public Book() {
        }

        public String getAuthorsName() {
            return authorsName;
        }

        public void setAuthorsName(String authorsName) {
            this.authorsName = authorsName;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public boolean isPublish() {
            return isPublish;
        }

        public void setPublish(boolean publish) {
            isPublish = publish;
        }

    }
}
