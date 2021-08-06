package com.main.api.firebase;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;

@Configuration
public class FirebaseInit {

    @Bean
    public Firestore initialize() throws Exception {
            FileInputStream serviceAccount = new FileInputStream("./firebase-account-info.json");

            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build();

           FirebaseApp firebaseApp = FirebaseApp.initializeApp(options);
           return FirestoreClient.getFirestore(firebaseApp);
    }
}
