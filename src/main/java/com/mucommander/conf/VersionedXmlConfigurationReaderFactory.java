/*
 * This file is part of muCommander, http://www.mucommander.com
 * Copyright (C) 2002-2016 Maxence Bernard
 *
 * muCommander is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * muCommander is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.mucommander.conf;

import com.mucommander.commons.conf.ConfigurationReader;
import com.mucommander.commons.conf.ConfigurationReaderFactory;
import com.mucommander.commons.conf.ReaderConfigurationException;

/**
 * @author Maxence Bernard
 */
public class VersionedXmlConfigurationReaderFactory implements ConfigurationReaderFactory {

    ///////////////////////////////////////////////
    // ConfigurationReaderFactory implementation //
    ///////////////////////////////////////////////


    public ConfigurationReader getReaderInstance() throws ReaderConfigurationException {
        return new VersionedXmlConfigurationReader();
    }
}
