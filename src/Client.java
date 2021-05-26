

import MorceauManager.*;

//
//Copyright (c) ZeroC, Inc. All rights reserved.
//


public class Client
{
 public static void main(String[] args)
 {
	 //Ice::ObjectPrx proxy = communicator->stringToProxy("factory@EncoderAdapter");
	 //Ripper::MP3EncoderFactoryPrx factory = Ripper::MP3EncoderFactoryPrx::checkedCast(proxy);
	 //Ripper::MP3EncoderPrx encoder = factory->createEncoder();
	 
	 
     try(com.zeroc.Ice.Communicator communicator = com.zeroc.Ice.Util.initialize(args))
     {
         communicator.getProperties().setProperty("Ice.Default.Package", "MorceauManager");
         Mp3filesManagerPrx mp3manager = Mp3filesManagerPrx.checkedCast(communicator.stringToProxy("Mp3filesManager:default -h 10.188.38.53 -p 10000"));
         
       // -> Ajouter Fichier au serveur        
       //mp3manager.ajouterMorceauMp3("Counting-Stars", "OneRepublic", "C:\\Users\\etudiant\\Desktop\\Streaming MUSIC\\onerepublic-counting-stars.mp3");
       //  mp3manager.ajouterMorceauMp3("Memories", "Maroon-5", "C:\\Users\\etudiant\\Desktop\\Streaming MUSIC\\maroon-5-memories.mp3");
         
         
        // -> commencer le Streaming
        // mp3manager.startStream("OneRepublic_Counting-Stars.mp3");
         //mp3manager.startStream("Maroon-5_Memories.mp3");
         
         
        // -> Pause Streaming         
        //mp3manager.pauseStream();
         
         // -> reprendre Streaming
         //mp3manager.resumeStream();
         
         
        // -> Arreter le Streaming         
        //mp3manager.arreterStream();
         

         
        // -> Supprimer Fichier
        // C:\Users\etudiant\eclipse-workspace\DSSpotify-Streaming-Server\resource_files\Souf_sf.mp3
        // mp3manager.supprimerMorceauMp3("Souf", "C:\\Users\\etudiant\\eclipse-workspace\\DSSpotify-Streaming-Server\\resource_files\\Souf_sf.mp3");
         
        // -> Modifier Fichier
        //mp3manager.modifierMorceauMp3("Memories", "Maroon-5", "memo-5");
         
         //Chercher fichier
        // System.out.println(" Fichier Titre Memories Auteur Maroon-5 : "+mp3manager.findByTitreAuteur("Memories", "Maroon-5"));
         
         //mp3manager.findByTitre("Memories");
        // System.out.println(" Fichier Titre Memories : "+mp3manager.findByTitre("Memories"));
         
         
         //mp3manager.findByAuteur("Maroon-5");
         System.out.println(" Fichier Auteur Maroon-5 : "+mp3manager.findByAuteur("Maroon-5"));
         
         
         
         
     }
 }
}