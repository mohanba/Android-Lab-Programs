package nmit.mohan.com.camerasdcard;

import android.net.Uri;

/**
 * Created by mohan on 9/19/17.
 */

public class ImageModel {
    private String name;
    private Uri uri;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Uri getUri() {
        return uri;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }
}
