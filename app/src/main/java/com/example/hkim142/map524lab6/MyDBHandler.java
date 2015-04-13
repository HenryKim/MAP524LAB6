package com.example.hkim142.map524lab6;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class MyDBHandler extends SQLiteOpenHelper {

    private static final int dbVersion = 1;
    private static final String dbName = "friendDB";
    private static final String friendsTable = "friends";

    private static final String friendId = "id";
    private static final String name = "name";
    private static final String phone = "phone_number";
    private static final String email = "email";

    public MyDBHandler(Context context, String dbName) {
        super(context, dbName, null, dbVersion);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String initialFriends ="INSERT INTO `friends` (`id`,`name`,`phone_number`,`email`) VALUES (1,\"Amela\",\"(545) 967-1728\",\"Cras@euenimEtiam.ca\"),(2,\"Graham\",\"(319) 595-6540\",\"est.arcu@vestibulumneceuismod.edu\"),(3,\"Madeson\",\"(244) 150-2309\",\"egestas.ligula.Nullam@sagittis.com\"),(4,\"Mollie\",\"(709) 726-0952\",\"nisi.Mauris.nulla@Crasvulputatevelit.org\"),(5,\"Ashton\",\"(265) 787-8806\",\"ante@tempor.co.uk\"),(6,\"Nicholas\",\"(279) 389-8895\",\"sed.tortor@ultriciessem.com\"),(7,\"Keegan\",\"(705) 416-7470\",\"velit.Sed.malesuada@Integereu.edu\"),(8,\"Debra\",\"(310) 648-6757\",\"felis.Nulla@sodalesMaurisblandit.org\"),(9,\"Thane\",\"(243) 664-1582\",\"sapien@vulputatenisi.org\"),(10,\"MacKenzie\",\"(330) 457-1480\",\"Integer@rutrumurna.com\"),(11,\"Nigel\",\"(653) 634-9162\",\"risus.Donec@risusquis.org\"),(12,\"Price\",\"(648) 682-9066\",\"sem.egestas@diamatpretium.edu\"),(13,\"Guinevere\",\"(575) 258-7886\",\"eu.euismod.ac@amet.net\"),(14,\"Libby\",\"(836) 379-9217\",\"at.sem@commodoipsumSuspendisse.co.uk\"),(15,\"Patricia\",\"(317) 597-5293\",\"vitae@tempusnonlacinia.co.uk\"),(16,\"Fuller\",\"(397) 470-1667\",\"justo.eu.arcu@ametfaucibus.ca\"),(17,\"Serina\",\"(704) 146-0182\",\"ligula@lobortis.org\"),(18,\"Aphrodite\",\"(922) 850-4388\",\"Proin.velit.Sed@acnulla.org\"),(19,\"Cassandra\",\"(936) 159-5700\",\"urna@erat.ca\"),(20,\"Patricia\",\"(519) 425-8340\",\"Pellentesque.tincidunt@Nuncmauris.com\"),(21,\"Clinton\",\"(977) 498-0140\",\"ipsum@sagittisaugue.co.uk\"),(22,\"Todd\",\"(864) 975-5574\",\"vitae.orci.Phasellus@malesuada.co.uk\"),(23,\"Carla\",\"(430) 591-5035\",\"Nunc.mauris@non.co.uk\"),(24,\"Josephine\",\"(722) 614-1971\",\"blandit.Nam.nulla@necmetusfacilisis.co.uk\"),(25,\"Camilla\",\"(904) 208-2988\",\"erat.Sed@diamloremauctor.co.uk\"),(26,\"Hayden\",\"(996) 913-2623\",\"Donec.felis.orci@faucibuslectusa.net\"),(27,\"Chaney\",\"(968) 787-8669\",\"Fusce@eueleifendnec.ca\"),(28,\"Bryar\",\"(688) 464-1644\",\"Suspendisse@leoelementum.edu\"),(29,\"Jada\",\"(970) 254-0935\",\"nonummy.ac@metusAliquam.edu\"),(30,\"Alisa\",\"(812) 240-5304\",\"sed.tortor.Integer@felisorci.com\"),(31,\"Tiger\",\"(244) 709-9383\",\"semper.auctor@dictumeu.com\"),(32,\"Jelani\",\"(810) 404-6810\",\"elit.pretium.et@in.co.uk\"),(33,\"Wynne\",\"(887) 572-8511\",\"Donec.egestas.Aliquam@acturpisegestas.com\"),(34,\"Emi\",\"(715) 170-2022\",\"gravida.sagittis@nondapibus.net\"),(35,\"Demetrius\",\"(586) 513-0081\",\"metus@Maurismolestie.com\"),(36,\"Aurelia\",\"(869) 226-1283\",\"blandit.at.nisi@blanditcongueIn.ca\"),(37,\"Sydnee\",\"(756) 710-5572\",\"parturient@ipsumCurabitur.edu\"),(38,\"Barrett\",\"(926) 431-4081\",\"malesuada.vel@temporeratneque.net\"),(39,\"Sigourney\",\"(883) 465-8481\",\"malesuada@semperet.co.uk\"),(40,\"Joelle\",\"(273) 837-4580\",\"eget@arcuSedeu.com\"),(41,\"Ciaran\",\"(774) 740-1654\",\"euismod.in@sit.net\"),(42,\"Abbot\",\"(752) 467-6949\",\"consequat@ultricies.net\"),(43,\"William\",\"(210) 500-2862\",\"Nunc.ut@quislectus.edu\"),(44,\"Fiona\",\"(231) 570-3394\",\"accumsan.laoreet.ipsum@arcuCurabiturut.edu\"),(45,\"Naida\",\"(540) 132-4093\",\"Fusce.feugiat.Lorem@hendreritDonecporttitor.org\"),(46,\"Zeus\",\"(568) 719-2693\",\"vulputate@tinciduntnuncac.net\"),(47,\"Kaden\",\"(184) 495-1262\",\"dolor.sit@egestas.ca\"),(48,\"Janna\",\"(373) 950-5245\",\"urna.Nunc.quis@magnatellus.ca\"),(49,\"Prescott\",\"(534) 398-2062\",\"at.egestas@tellusfaucibus.co.uk\"),(50,\"Brent\",\"(468) 207-1079\",\"massa.non.ante@Aliquam.ca\"),(51,\"Callum\",\"(184) 519-2615\",\"Curabitur.ut.odio@infaucibus.org\"),(52,\"Galena\",\"(591) 515-5133\",\"pede@eu.co.uk\"),(53,\"Flavia\",\"(556) 518-8134\",\"Phasellus@iaculis.org\"),(54,\"Dana\",\"(547) 147-8676\",\"Proin.velit.Sed@nec.com\"),(55,\"Drew\",\"(736) 296-4561\",\"sociis@Uttincidunt.com\"),(56,\"Vivian\",\"(185) 811-9152\",\"pretium@Nulla.com\"),(57,\"Carla\",\"(199) 108-6675\",\"dapibus.id@Sedeueros.edu\"),(58,\"Sonya\",\"(771) 616-9158\",\"in.molestie@Aliquam.ca\"),(59,\"Olympia\",\"(113) 672-0514\",\"orci@ultrices.org\"),(60,\"Stewart\",\"(720) 711-8937\",\"ut@nuncullamcorper.co.uk\"),(61,\"Garth\",\"(549) 874-5438\",\"mauris.eu.elit@consequatnecmollis.com\"),(62,\"Hannah\",\"(851) 996-6635\",\"ipsum.sodales@Duisacarcu.edu\"),(63,\"Julie\",\"(776) 309-8318\",\"magna@Donecatarcu.net\"),(64,\"Walker\",\"(468) 432-9495\",\"urna.suscipit.nonummy@dignissimpharetraNam.co.uk\"),(65,\"Caesar\",\"(678) 268-8063\",\"vitae.odio@tortorNunc.com\"),(66,\"Linda\",\"(469) 625-1011\",\"pharetra.Quisque@metussit.co.uk\"),(67,\"Ross\",\"(280) 486-7334\",\"varius.orci.in@pede.com\"),(68,\"Baker\",\"(174) 299-2827\",\"sit.amet@odio.com\"),(69,\"Lucas\",\"(636) 411-8961\",\"nunc@ipsumdolor.co.uk\"),(70,\"Felix\",\"(224) 183-5588\",\"eget.odio.Aliquam@Sednunc.com\"),(71,\"Pamela\",\"(308) 677-5625\",\"est.vitae@parturientmontesnascetur.edu\"),(72,\"Caesar\",\"(874) 831-7908\",\"lacus.Nulla@Integervitae.edu\"),(73,\"Brennan\",\"(321) 278-2343\",\"molestie.tortor@velsapien.co.uk\"),(74,\"Arthur\",\"(644) 679-4234\",\"sollicitudin.adipiscing@enim.edu\"),(75,\"Carter\",\"(738) 177-8906\",\"interdum.feugiat@Nullamfeugiat.org\"),(76,\"Duncan\",\"(983) 193-5819\",\"nec.imperdiet@gravidasitamet.org\"),(77,\"Mohammad\",\"(391) 774-8907\",\"posuere@tempusmauris.net\"),(78,\"Candace\",\"(922) 507-1007\",\"ante@aliquamerosturpis.co.uk\"),(79,\"Amena\",\"(108) 735-9523\",\"diam.lorem.auctor@porttitorscelerisque.edu\"),(80,\"Rinah\",\"(459) 458-7496\",\"risus@pretium.org\"),(81,\"Brenden\",\"(768) 467-0605\",\"sem@enimNunc.ca\"),(82,\"Nolan\",\"(783) 276-5742\",\"arcu.Morbi.sit@egetvenenatisa.org\"),(83,\"Jeanette\",\"(562) 322-4552\",\"Cras@Donecfelis.com\"),(84,\"Quynn\",\"(199) 861-8985\",\"magnis.dis.parturient@sodalespurusin.org\"),(85,\"Vance\",\"(738) 790-5563\",\"sapien@vitaeorciPhasellus.com\"),(86,\"Teegan\",\"(314) 255-2803\",\"Aliquam@vel.ca\"),(87,\"Aristotle\",\"(881) 549-6123\",\"Proin.non.massa@tempusnonlacinia.org\"),(88,\"Diana\",\"(609) 419-2525\",\"purus.gravida.sagittis@felisorci.co.uk\"),(89,\"Rhea\",\"(234) 215-9095\",\"viverra@dolor.net\"),(90,\"Winter\",\"(598) 265-4031\",\"aliquet@Namtempor.com\"),(91,\"Warren\",\"(108) 212-8271\",\"arcu@malesuadautsem.org\"),(92,\"Steel\",\"(967) 919-2882\",\"a@Integer.co.uk\"),(93,\"Charity\",\"(936) 973-4042\",\"metus.vitae@quamquis.ca\"),(94,\"Quemby\",\"(363) 747-5984\",\"sollicitudin.a@purus.com\"),(95,\"Julie\",\"(510) 718-2802\",\"diam.dictum@ipsum.com\"),(96,\"Brynn\",\"(847) 387-5538\",\"non.leo@nislsem.org\"),(97,\"Plato\",\"(101) 316-3637\",\"enim.Curabitur.massa@necanteblandit.edu\"),(98,\"Medge\",\"(110) 994-4832\",\"natoque@sed.net\"),(99,\"Callum\",\"(811) 857-7193\",\"quis@dignissim.net\"),(100,\"Lana\",\"(617) 941-7115\",\"ipsum@Curabitur.com\");\n";
        String createFriendTable = "CREATE TABLE " + friendsTable + "("
                + friendId + " INTEGER PRIMARY KEY," + name + " TEXT,"
                + phone + " TEXT," + email + " TEXT" + ")";
        db.execSQL(createFriendTable);
        db.execSQL(initialFriends);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + friendsTable);
        onCreate(db);
    }

    public List<Friend> getAllFriends() {
        List<Friend> friendList = new ArrayList<Friend>();
        String selectQuery = "SELECT  * FROM " + friendsTable;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            do {
                Friend friend = new Friend();
                friend.setId(Integer.parseInt(cursor.getString(0)));
                friend.setName(cursor.getString(1));
                friend.setPhoneNumber(cursor.getString(2));
                friend.setEmail(cursor.getString(3));
                friendList.add(friend);
            } while (cursor.moveToNext());
        }

        // return contact list
        return friendList;
    }
   }
