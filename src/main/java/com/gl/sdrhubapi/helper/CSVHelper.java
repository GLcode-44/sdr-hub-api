package com.gl.sdrhubapi.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.gl.sdrhubapi.entity.LeadEntity;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.web.multipart.MultipartFile;

    public class CSVHelper {
        public static String TYPE = "text/csv";
        static String[] HEADERS = { "first_name", "last_name", "company", "phone", "state", "email"};
        public static boolean hasCSVFormat(MultipartFile file) {
            if (!TYPE.equals(file.getContentType())) {
                return false;
            }
            return true;
        }
        public static List<LeadEntity> csvToLeads(InputStream is) {
            try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                 CSVParser csvParser = new CSVParser(fileReader,
                         CSVFormat.EXCEL.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {
                List<LeadEntity> leads = new ArrayList<>();
                Iterable<CSVRecord> csvRecords = csvParser.getRecords();
                for (CSVRecord csvRecord : csvRecords) {
                    LeadEntity lead = new LeadEntity(
                            csvRecord.get("id"),
                            csvRecord.get("first_name"),
                            csvRecord.get("last_name"),
                            csvRecord.get("title"),
                            csvRecord.get("company"),
                            csvRecord.get("description"),
                            csvRecord.get("phone"),
                            csvRecord.get("state"),
                            csvRecord.get("email"),
                            csvRecord.get("lead_source"),
                            csvRecord.get("website"),
                            csvRecord.get("class_"),
                            csvRecord.get("class_type"),
                            csvRecord.get("status"),
                            csvRecord.get("tags"),
                            csvRecord.get("lead_disqualification_reason"),
                            csvRecord.get("lead_source_description"),
                            Integer.parseInt(csvRecord.get("call_count")),
                            Integer.parseInt(csvRecord.get("email_count")),
                            Integer.parseInt(csvRecord.get("total_contacts"))
                    );
                    leads.add(lead);
                }
                return leads;
            } catch (IOException e) {
                throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
            }
        }
    }

